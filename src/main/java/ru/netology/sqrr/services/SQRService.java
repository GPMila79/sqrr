
package ru.netology.sqrr.services;

public class SQRService {
    // min - начальное значение
    //  max - конечное значение

    public int calcSQR(int min, int max) {
        int quantity = 0;
        for (int i = 10; i <= 99; i++) {
            if (i * i >= min && i * i <= max) {
                quantity++;
            }

        }
        return quantity;
    }
}

