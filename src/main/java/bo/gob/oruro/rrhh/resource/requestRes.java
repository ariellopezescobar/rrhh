package bo.gob.oruro.rrhh.resource;

import java.util.HashMap;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import bo.gob.oruro.rrhh.model.response;

@RestController
@RequestMapping("rest/response")
@CrossOrigin
public class requestRes {
    response res; 
    @PostMapping
    public response read() {
        res = new response();
        HashMap<String, String> map = new HashMap<>();
        map.put("message", "asdsad");
        res.replies.add(map);
        res.replies.add(map);
        res.replies.add(map);
        res.replies.add(map);
        res.replies.add(map);
        return res;
    }

}
