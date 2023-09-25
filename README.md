## Some small food delivery backend service for fun and practice

To start project first off deploy **postgresql** database
> docker-compose up

If you don't want to use heavy docker containership, you can use your local database.
Just don't forget to change url in **application.properties**

After managing database stuff you can just start off main class **DemoApplication**. App starts on localhost:8080

Congratulations. Now you can create and get basic orders using API methods in controller directory. Try something like

> GET /order /order/{id}
>
> POST /order with json payload like {"clientInfo": " ", "deliveryAddress": " ", "orderList": " "}