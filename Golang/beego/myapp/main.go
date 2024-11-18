package main

import (
    "github.com/beego/beego/v2/server/web"
    "github.com/beego/beego/v2/client/orm"
    _ "github.com/go-sql-driver/mysql" // MySQL driver
    _ "myapp/routers" // Import routers
)

func init() {
    orm.RegisterDriver("mysql", orm.DRMySQL)
    orm.RegisterDataBase("default", "mysql", web.AppConfig.DefaultString("dataSource", ""))
}

func main() {
    web.Run()
}
