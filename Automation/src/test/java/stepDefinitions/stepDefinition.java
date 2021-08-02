package stepDefinitions;

im


    @Then("^Home page is populate$")
    public void home_page_is_populate() throws Throwable
    {
    	System.out.println("Home page is populate");
        
    }

    @And("^Cards displayed are \"([^\"]*)\"$")
    public void cards_displayed_are_something(String strArg1) throws Throwable
    {
       if (strArg1 == "true")
       {
		 System.out.println("Cards are displayed");
       } 
       else 
       {
    	   System.out.println("Cards are not displayed");
       }
    }
    
   
}
