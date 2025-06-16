package StackAll;

import java.util.Stack;

public class RealTimeExample {
    public Stack<String> backword,forword;
    public String currentPage;
    public RealTimeExample() {
        backword=new Stack<String>();
        forword=new Stack<String>();
        currentPage="Home page";
    }
    //add page
    public  void Addpage(String newpage){
        backword.push(currentPage);
        currentPage=newpage;
        forword.clear();
    }

    public void previousPage(){
        if(!backword.isEmpty()){
            forword.push(currentPage);
            currentPage=backword.pop();
        }
    }

    public void nextPage(){
        if(!forword.isEmpty()){
            backword.push(currentPage);
            currentPage=forword.pop();
        }
    }

    public void displayHistory(){
        for(String s:backword){
            System.out.println(s);
        }
    }

    public void deleteHistory(){
        backword.clear();//backword=null;
        System.out.println("History deleted");
    }

    public String getCurrentPage(){
        return "current page"+currentPage;
    }
    public static void main(String[] args) {
        RealTimeExample rt=new RealTimeExample();
        rt.Addpage("Home page");
        rt.Addpage("About page");
        rt.Addpage("Contact page");
        rt.Addpage("Services page");
        rt.Addpage("Portfolio page");
        rt.Addpage("Blog page");
        rt.Addpage("Team page");
        rt.Addpage("Pricing page");
        rt.Addpage("Contact page");
        rt.Addpage("Services page");
        rt.Addpage("Portfolio page");
        rt.Addpage("Blog page");
        rt.Addpage("Team page");
        rt.Addpage("Pricing page");
        rt.Addpage("Contact page");
        rt.Addpage("Services page");
        rt.Addpage("Portfolio page");
        rt.Addpage("Blog page");
        rt.Addpage("Team page");
        rt.Addpage("Pricing page");
        rt.Addpage("Contact page");
        rt.Addpage("Services page");
        rt.Addpage("Portfolio page");
        rt.Addpage("Blog page");
        rt.Addpage("Team page");
        rt.Addpage("Pricing page");
        System.out.println("history");
        rt.displayHistory();
        System.out.println("current page");
        System.out.println(rt.getCurrentPage());
        rt.nextPage();

    }
}
