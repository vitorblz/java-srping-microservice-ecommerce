package br.com.vitor.checkout.service;
import br.com.vitor.checkout.controller.CheckoutRequest;
import br.com.vitor.checkout.entity.CheckoutEntity;

import java.util.Optional;

public interface CheckoutService {

    Optional<CheckoutEntity> create(CheckoutRequest checkoutRequest);

    // Optional<CheckoutEntity> updateStatus(String checkoutCode, CheckoutEntity.Status status);
}