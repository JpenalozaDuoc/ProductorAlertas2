package productor_alerts.productor_alertas.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import productor_alerts.productor_alertas.service.ProductorService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
public class ProductorController {

    @Autowired
    private ProductorService producer;

    @PostMapping("/send")
    public String sendMessage(@RequestParam("message") String message) {
        producer.sendMessage(message);
        return "Mensaje enviado: " + message;
    }

    @PostMapping("/sendBody")
    public String postMethodName(@RequestBody String message) {
        producer.sendMessage(message);
        return "Mensae enviado: " + message;
    }


    @PostMapping("/sendJSON")
    public String sendMessageJSON(@RequestParam("message") String message) {
        producer.sendMessage(message);
        return "Mensaje enviado: " + message;
    }
    
}
