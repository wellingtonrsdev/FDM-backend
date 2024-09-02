package com.devsuperior.services;

import com.devsuperior.entities.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ShippingService {

    public double shipment(Order order) {

        double delivery = 0.0;
        if (order.getBasic() < 100.00) {
            delivery = 20.00;
        } else if (order.getBasic() <= 200) {
            delivery = 12.00;
        } else {
            delivery = 0.0;
        }
        return delivery;
    }
}
