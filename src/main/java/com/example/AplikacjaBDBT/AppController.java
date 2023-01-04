package com.example.AplikacjaBDBT;

import com.example.AplikacjaBDBT.baza.Samochod;
import com.example.AplikacjaBDBT.baza.SamochodyDAO;
import com.example.AplikacjaBDBT.baza.Sprzedaz;
import com.example.AplikacjaBDBT.baza.SprzedazeDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Configuration
public class AppController implements WebMvcConfigurer {
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/index").setViewName("index");
        registry.addViewController("/").setViewName("index");
        registry.addViewController("/main").setViewName("main");
        registry.addViewController("/login").setViewName("login");
        registry.addViewController("/main_admin").setViewName("admin/main_admin");
        registry.addViewController("/main_user").setViewName("user/main_user");
    }

    @Controller
    public static class DashboardController {

        @Autowired
        private SprzedazeDAO sprzedazeDAO;

        @Autowired
        private SamochodyDAO samochodyDAO;

        @RequestMapping(value = {"/", "/index"})
        public String viewHomePage(Model model) {
            model.addAttribute("listSprzedaze", sprzedazeDAO.list());
            model.addAttribute("listSamochody", samochodyDAO.list());
            return "index";
        }

        @RequestMapping
                ("/main")
        public String defaultAfterLogin
                (HttpServletRequest request) {
            if
            (request.isUserInRole
                    ("ADMIN")) {
                return "redirect:/main_admin";
            }
            else if
            (request.isUserInRole
                            ("USER")) {
                return "redirect:/main_user";
            }
            else
            {
                return "redirect:/index";
            }
        }

        @RequestMapping("/new")
        public String showNewForm(Model model) {
            Sprzedaz sprzedaz = new Sprzedaz();
            model.addAttribute("sprzedaz", sprzedaz);
            return "new_form";
        }
        @RequestMapping(value = "/save", method = RequestMethod.POST)
        public String save(@ModelAttribute("sprzedaz") Sprzedaz sprzedaz) {
            sprzedazeDAO.save(sprzedaz);
            return "redirect:/";
        }
    }

    @RequestMapping(value={"/main_admin"})
    public String showAdminPage(Model model) {
        return "admin/main_admin";
    }
    @RequestMapping(value={"/main_user"})
    public String showUserPage(Model model) {
        return "user/main_user";
    }

}


