import (
	"github.com/beego/beego/v2/server/web/context"
)

var AuthMiddleware = func(ctx *context.Context) {
	token := ctx.Input.Header("Authorization")
	if token == "" {
		ctx.Output.SetStatus(401)
		ctx.Output.Body([]byte("Unauthorized"))
		return
	}
}
