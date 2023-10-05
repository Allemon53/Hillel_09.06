package ua.hillel.page.object;

public interface HeaderLogic {

    default HeaderLogic iCheckingNumberOnCartIcon(String num){
        return this;
    }
}