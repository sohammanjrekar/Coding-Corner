// The type of hook methods should be func(*gorm.DB) error

// Before runing GORM begins a transaction
BeforeSave
BeforeCreate
// save before associations
// insert into database
// save after associations
AfterCreate
AfterSave
// After runing commit or rollback transaction
// Hooks on Create Actions
func (u *User) BeforeCreate(tx *gorm.DB) (err error) {
  u.UUID = uuid.New()

  if !u.IsValid() {
    err = errors.New("can't save invalid data")
  }
  return
}
func (u *User) AfterCreate(tx *gorm.DB) (err error) {
  if u.ID == 1 {
    tx.Model(u).Update("role", "admin")
  }
  if !u.IsValid() {
    return errors.New("rollback invalid user")
  }
  return
}
func (u *User) AfterCreate(tx *gorm.DB) (err error) {
  if !u.IsValid() {
    return errors.New("rollback invalid user")
  }
  return nil
}

// Hooks on Update Actions
// Before runing GORM begins a transaction
BeforeSave
BeforeUpdate
// save before associations
// update database
// save after associations
AfterUpdate
AfterSave
// After runing commit or rollback transaction
// Hooks on Update Actions Examples
func (u *User) BeforeUpdate(tx *gorm.DB) (err error) {
  if u.readonly() {
    err = errors.New("read only user")
  }
  return
}

// Updating data in same transaction
func (u *User) AfterUpdate(tx *gorm.DB) (err error) {
  if u.Confirmed {
    tx.Model(&Address{}).Where("user_id = ?", u.ID).Update("verfied", true)
  }
  return
}
// Hooks on Delete Actions
// Before runing GORM begin transaction
BeforeDelete
// delete from database
AfterDelete
// After runing commit or rollback transaction
// Hooks on Delete Actions Examples
func (u *User) AfterDelete(tx *gorm.DB) (err error) {
  if u.Confirmed {
    tx.Model(&Address{}).Where("user_id = ?", u.ID).Update("invalid", false)
  }
  return
}
// Hooks on Read Actions
// Before runing GORM begin transaction
AfterFind
// After runing commit or rollback transaction
// Hooks on Read Actions Examples
func (u *User) AfterFind(tx *gorm.DB) (err error) {
  if u.MemberShip == "" {
    u.MemberShip = "user"
  }
  return
}