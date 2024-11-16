package main
import("fmt")
func reverse(a string, b string) (string, string) {
    return b, a
}

func main(){
	val1,val2:=reverse("soham","raj")
	fmt.Println(val1,val2)
}