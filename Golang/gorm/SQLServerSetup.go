import (
	"gorm.io/driver/sqlserver"
	"gorm.io/gorm"
   )
   dsn := "sqlserver://gorm:LoremIpsum86@localhost:9930?database=gorm"
   db, err := gorm.Open(sqlserver.Open(dsn), &gorm.Config{})