package com.sample.operation.boot;

import com.sample.operation.controller.OperationController;
import com.sample.operation.entity.OperationHistory;
import com.sample.operation.service.OperationService;

public class Demo {

    public static void main(String[] args) {
        OperationService service1 = new OperationService();
        OperationController operationController = new OperationController(service1);
        OperationHistory operationHistory = operationController.getOperationHistory("delete");
        System.out.println(operationHistory.getOperationType());
    }
}
