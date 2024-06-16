package com.thawanaulas.aula.service;

import com.thawanaulas.aula.entities.Order;
import org.springframework.stereotype.Service;

@Service
public class ShippingService {
    public double shipping(Order order) {
        if (order.getBasic() < 100) {
            return 20.0;
        } else if (order.getBasic() >= 100 && order.getBasic() <= 200) {
            return 12.0;
        } else {
            return 0.0;
        }
    }
}
