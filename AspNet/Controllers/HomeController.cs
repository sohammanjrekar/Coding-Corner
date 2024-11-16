using Microsoft.AspNetCore.Mvc;

namespace MyFirstAspNetApp.Controllers
{
    public class HomeController : Controller
    {
        public IActionResult Index()
        {
            return View();
        }
    }
}
