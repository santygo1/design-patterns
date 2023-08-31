package com.ds.state;

public class Developer {

    private Activity currentActivity;

    Developer(){
        setCurrentActivity(new Sleeping());
    }

    public void setCurrentActivity(Activity currentActivity) {
        this.currentActivity = currentActivity;
    }

    public void changeCurrentActivity(){
        if (currentActivity instanceof Sleeping) {
            setCurrentActivity(new Coding());
        }else if (currentActivity instanceof Coding){
            setCurrentActivity(new DrinkingCoffee());
        }else{
            setCurrentActivity(new Sleeping());
        }
    }

    public void doActivity(){
        currentActivity.doActivity();
    }

}
