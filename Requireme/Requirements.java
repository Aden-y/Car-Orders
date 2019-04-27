/*
BusOrder
As stated in the CarOrder requirements, the payment process is different for different vehicles. The main difference is that usually busses are bought by cities/companies in bulk, and cars are mostly bought in a one-car-per-customer fashion. The benefit of buying in bulk is that the buyer gets a discount on the total price of the busses they buy, and the more busses they buy, the bigger the discount. 
Also, cities, counties and other government bodies usually get an extra discount on top of the first bulk discounted price. 
For the calculations to be made, we first need an invoice, or an order. The order method, which is the constructor in our case (described in detail below), will set some variables in the instance of the BusOrder object, such as quantity, buyer, whether they are a government buyer or not, etc.. It will also call some methods to set some variables based on calculations made for the discount percentage and price per bus. 
Once a bus order is made, Pretty Vehicles wants to be able to print a schedule as to when the busses are going to be built and finished, and how many per month they are going to build. The way they decide the schedule is based on how many vehicles the buyer is buying. A buyer that buys more vehicles is going to have more priority, and by that we mean more buses per month will be built for them.
With all that in mind, here are the requirements your manager compiled:
•	Variables
o	quantity
o	model
o	model year
o	buyerName
o	governmentBody (boolean)
o	loanLengthYears
o	discountPercent
o	pricePerBus
•	Methods
o	getters and setters for all the variables mentioned above. 
o	A constructor (quantity, model, year, buyerName, governmentBody, loanLengthYears); 
	When the constructor is initiated, apart from setting the variables' values, it should call a method calculateDiscountPercent() - described next, and a calculatePricePerBus() method - described below. If the model name is not one of the model names mentioned below, print a message saying "This model does not exist"
o	calculateDiscountPercent() : this method will calculate the discount percent and set the discountPercent variable in the class instance. The discount is calculated this way:
	If a government body, an initial 5% discount automatically applies, if not, no initial discount is applied
	If the model year of the busses in the order is less than 2016, then a 3% discount is added to the current discount percentage sum, else - no discount is added to the percentage sum 
	Based on the quantity
	If less than 10 buses are ordered, no quantity discount is applied
	if the quantity is between 10 and 50, a 5% discount is added to the current discount percentage sum
	if the quantity is greater than 50, then a 10% discount is added to the current discount percentage sum
o	calculatePricePerBus() : this method calculates the price per bus for the order based on the model year and the model name. The following are the prices of the busses per model year bracket.
	Model "Mad Max"
	Model year 2016 - 2019 -> $80,000
	Model year 2013 - 2015 -> $60,000
	Model year 2010 - 2012 -> $45,000
	Model "Low Emission"
	Model year 2016 - 2019 -> $95,000
	Model year 2013 - 2015 -> $80,000
	Model year 2010 - 2012 -> $65,000
	Model "No Oil"
	Model year 2016 - 2019 -> $110,000
	Model year 2013 - 2015 -> $95,000
	Model year 2010 - 2012 -> $80,000
•	Additional Methods
o	printBuildingSchedule() : this method will print the building schedule for each month of the building process. As briefly mentioned above, the schedule is based on the quantity of busses ordered. The rules are the following:
	If less than 10 busses are ordered, PV builds them with a regular schedule, and that is 4 per month.
	If 10 - 50 busses are ordered, PV builds 6 busses per month, or one bus every 5 days. 
	If more than 50 busses are ordered, PV builds 8 busses per month, or 2 busses per week. 

Based on that, you should build this method so that it prints the number of busses for each month. For example, if 7 busses are ordered: 

Month 1 - 4 buses
Month 2 - 3 buses
o	printPaymentSchedule() : this method will print the payment schedule. First, it will calculate the total price that needs to be paid, that is: quantity x pricePerBus x discountPercent. After that number is found, the interest amount needs to be calculated. PV's rule is that government bodies don't pay interest (0%), but private companies need to pay 1% interest. Use the formula described here (Links to an external site.)Links to an external site. to calculate the interest amount. Once you have a final number, print the payment for each month . Example:

Month 1 : $599
Month 2 : $599 

The value is going to be repetitive, but usually companies want to have the month to month breakdown so that they can use it for their budget planning. 

*/