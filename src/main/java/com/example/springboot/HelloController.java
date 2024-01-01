package com.example.springboot;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }

    @GetMapping("/hello")
    public String hello() {
        return "Greetings from Spring Boot in hello Controller!";
    }

    @GetMapping("/json")
    public YourModelClass getJson() {
        YourModelClass jsonData = new YourModelClass();
        jsonData.setUserId(1);
        jsonData.setId(1);
        jsonData.setTitle("Local Object Skull");
        jsonData.setCompleted(0);

        return jsonData;
    }

    public static class YourModelClass {
        private int userId;
        private int id;
        private String title;
        private int completed;

        public int getCompleted() {
            return completed;
        }

        public void setCompleted(int completed) {
            this.completed = completed;
        }

        // Crea los getters y setters para los campos
        // userId
        public int getUserId() {
            return userId;
        }

        public void setUserId(int userId) {
            this.userId = userId;
        }

        // id
        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        // title
        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }


    }

}