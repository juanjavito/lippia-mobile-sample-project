package com.crowdar.examples.steps;

import com.crowdar.core.Injector;
import com.crowdar.core.PageSteps;
import com.crowdar.examples.pages.*;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class PHPTravelSteps extends PageSteps {

    @Given("El cliente abre la aplicacion PHPTravel")
    public void abrirAPK(){

    }
    @When("El cliente presiona Hotel")
    public void clickHotel(){
        Injector._page(PHPTravelHomePage.class).clickHotel();
    }

    @And("El cliente ingresa el destino (.*)")
    public void insertDestino(String destino){
        Injector._page(PHPTravelDestinationPage.class).enterDestination(destino);
    }
    @And("El cliente selecciona el dia de entrada (.*)")
    public void insertCheckinDate(String date){
        Injector._page(PHPTravelDestinationPage.class).checkinDate(date);
    }

    @And("El cliente selecciona el dia de salida (.*)")
    public void insertCheckoutDate(String date){
        Injector._page(PHPTravelDestinationPage.class).checkoutDate(date);
    }
    @And("El cliente presiona buscar")
    public void clickBuscar(){
        Injector._page(PHPTravelDestinationPage.class).clickSearch();
    }

    @And("El cliente selecciona el primer resultado")
    public void selectFirstResult(){
        Injector._page(PHPTravelResultPage.class).clickFirstResult();
    }

    @And("El cliente selecciona la habitacion")
    public void selectFirstRoom(){
    Injector._page(PHPTravelHotelPage.class).clickFirstRoom();
    }
    @And("El cliente ingresa el nombre del titular de la tarjeta (.*)")
    public void enterTitular(String name){
    Injector._page(PHPTravelCheckinPage.class).enterCardName(name);
    }
    @And("El cliente ingresa el numero de la tarjeta (.*)")
    public void enterCardNumber(String number){
        Injector._page(PHPTravelCheckinPage.class).enterCardNumber(number);
    }
    @And("El cliente ingresa el vencimiento de la tarjeta (.*)")
    public void enterDate(String date){
        Injector._page(PHPTravelCheckinPage.class).enterMonthYear(date);
    }
    @And("El cliente ingresa el cvv de la tarjeta (.*)")
    public void enterCVV(String cvv){
        Injector._page(PHPTravelCheckinPage.class).enterCVV(cvv);
    }
    @And("El cliente ingresa su nombre (.*)")
    public void enterName(String nombre){
        Injector._page(PHPTravelCheckinPage.class).enterName(nombre);
    }
    @And("El cliente ingresa su apellido (.*)")
    public void enterLastName(String lastName){
        Injector._page(PHPTravelCheckinPage.class).enterLastName(lastName);
    }
    @And("El cliente ingresa su correo (.*)")
    public void enterEmail(String email){
        Injector._page(PHPTravelCheckinPage.class).enterEmail(email);
    }
    @And("El cliente ingresa su telefono (.*)")
    public void enterPhone(String number){
        Injector._page(PHPTravelCheckinPage.class).enterPhoneNumber(number);
    }
    @And("El cliente presiona Continuar")
    public void pressContinue(){
        Injector._page(PHPTravelCheckinPage.class).clickContinue();
    }


}
