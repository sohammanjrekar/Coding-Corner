package models

import "github.com/beego/beego/v2/client/orm"

type User struct {
    ID       int    `orm:"auto"`
    Username string `orm:"size(100)"`
    Email    string `orm:"size(100)"`
    Password string `orm:"size(100)"`
}

func init() {
    orm.RegisterModel(new(User))
}
