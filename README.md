# Restaurant Management App

Java console-based restaurant application built with **Maven**. It simulates a restaurant menu and ordering workflow, including categories, order creation, daily special offers, menu queries, product search, and menu export to JSON (using Gson).

## Features
- Display restaurant menu grouped by categories
- Create new orders (choose products + quantities)
- Build a custom pizza using the Builder pattern (dough, sauce, toppings)
- Select a daily offer and apply discounts when applicable
- Menu queries (examples in the app):
  - vegetarian products sorted alphabetically
  - average dessert price (if desserts exist)
  - check if any product price is over a threshold
- Search product by name
- Export menu to `exported_menu.json`

## Tech Stack
- Java 21
- Maven
- Gson (JSON)

## Project Structure
- `src/main/java/restaurant/` — main application code
- `config.json` — app configuration (e.g., restaurant name)
- `exported_menu.json` — generated output file (menu export)
- `pom.xml` — Maven configuration

## Usage (Menu Options)
When you run the app, you can:
1. View menu  
2. Create a new order  
3. Choose the daily offer  
4. Run menu queries  
5. Search for a product by name  
6. Export the menu to JSON  
7. Exit
