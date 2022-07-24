package com.kodilla.good.patterns.challenges.order;

public class ProductOrderService {

    private OrderServiceService orderServiceService;
    private OrderInformationInformation orderInformationInformation;
    private OrderRepositoryRepository orderRepositoryRepository;

    public ProductOrderService(OrderServiceService orderServiceService, OrderInformationInformation orderInformationInformation, OrderRepositoryRepository orderRepositoryRepository) {
        this.orderServiceService = orderServiceService;
        this.orderInformationInformation = orderInformationInformation;
        this.orderRepositoryRepository = orderRepositoryRepository;
    }

    public OrderDto process(final OrderRequest orderRequest) {
        boolean isRented = orderRepositoryRepository.order(orderRequest.getUser(), orderRequest.getNow());

        if (isRented) {
            orderInformationInformation.inform(orderRequest.getUser());
            orderServiceService.createOrder(orderRequest.getUser(), orderRequest.getNow());
            return new OrderDto(orderRequest.getUser(), true);
        } else {
            return new OrderDto(orderRequest.getUser(), false);
        }
    }
}
