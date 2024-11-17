import (
	"gorm.io/driver/sqlite" // Sqlite driver based on GGO
	"gorm.io/gorm"
   )
   db, err := gorm.Open(sqlite.Open("gorm.db"), &gorm.Config{})