package controllers

import (
	"myapp/models"

	"github.com/beego/beego/orm"
	"github.com/beego/beego/v2/server/web"
)

type UserController struct {
	web.Controller
}

func (c *UserController) CreateUser() {
	user := models.User{}
	if err := c.ParseForm(&user); err == nil {
		orm.NewOrm().Insert(&user)
		c.Data["json"] = map[string]string{"status": "success"}
	} else {
		c.Data["json"] = map[string]string{"status": "error", "message": err.Error()}
	}
	c.ServeJSON()
}
