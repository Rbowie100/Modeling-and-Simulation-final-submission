Project description:
This project takes in four values a customer amount, wait time amount, shopping time amount, and queue amount. These values are used to simulate a several days of a store using the exponential and Poisson distribution to help determine when customers enter and when customers go to checkout and then leave. After the program finishes running it creates three csv files that hold the average from all customers on that day, values for each customer, and the queue amounts and other information. For the customers individually it returns the time spent in store and when they entered and left. In the average file it gives the max, min, standard deviation, average, and confidence interval. In the queue file it tells the queue amounts at times during the programs runtime.

Installation Instructions:
1.	Download Java version 24 to Intelij.
2.	Download the files and place them in a folder so that Intelij of choice can see and run it.

Usage guide:
1.	Open main and its files in IntelIJ of your choice.
2.	Run the main file in the InteliJ
3.	Enter the historical customer amount, Wait time, and time spent in store shopping as well as queue amount.
4.	The simulation should start running and display the time, how many customers are entering at times, and the average at the end.
5.	Files are created after the simulation ends.


Parameter explanations:

Historical customer: Holds the historical customer value entered by the user

Dayend: A Boolean value to check to see if the day is over

Left: Checks to see if everybody has left the store

Wait: Holds the historical wait value at the checkout entered by the user

Averagetime:Holds the historical average time spent shopping entered by the user

Queueamount: Holds the amount of queues entered by the user

Clock: Holds the time object

distribution: accesses the algorithm class to give access to the e

queuevalue: holds a string that holds the queue amount of the queue throughout the run time of the program 

arrayplace:Holds the previous lenght of the array

average: holds the average time spent for all customers in the store

day: holds what number the current day is

max: Holds the maximum value of minutes a customer spent in the store

min: hold the minimum value of minutes a customer spent in the store

dayamount: holds the amount of customers that entered the store that day

standarddeviation: holds the standard deviation of the customers time spent in store

Confidenceintervalplus: holds the upper value of confidence interval

Confidenceintervalminus:Holds the lower value of the confidence interval

Example Outputs:
Values used:
Customer:45
Wait:2
Shopping time:45
Queue amount:4




<img width="736" height="299" alt="Picture1" src="https://github.com/user-attachments/assets/6c43dad1-bd96-469f-82a9-09164928d44a" />

<img width="736" height="472" alt="Picture2" src="https://github.com/user-attachments/assets/daa4163e-1099-42c4-8b93-d2028d0b8cb3" />
<img width="736" height="144" alt="Picture3" src="https://github.com/user-attachments/assets/9abad98e-6e23-46bc-be0c-db8968851841" />
<img width="736" height="443" alt="Picture4" src="https://github.com/user-attachments/assets/16600b02-7c03-43d3-9445-15eb7941f452" />
