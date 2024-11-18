package routers

import (
	"myapp/controllers"

	"github.com/beego/beego/v2/server/web"
)

func init() {
	web.Router("/user/create", &controllers.UserController{}, "post:CreateUser")
}
