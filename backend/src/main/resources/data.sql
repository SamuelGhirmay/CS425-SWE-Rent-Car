INSERT INTO public.discounts(amount, currency, description, title)
VALUES (150.00, 'USD', 'Holiday Discount', 'A discount you should not miss');

INSERT INTO public.vehicles(make, model, year, color, number_of_seats, fuel_type, price, transmission,vehicle_status,
                            plate_number, discount_id)
VALUES ('Toyota', 'Civic', 2002, 'Red', 5, 'Gasoline', 400.00, 'Manual','null', 'IO521', null);

INSERT INTO public.vehicles(make, model, year, color, number_of_seats, fuel_type, price, transmission,vehicle_status,
                            plate_number, discount_id)
VALUES ('Honda', 'Civic', 1999, 'blue', 5, 'diesel', 300.00, 'Auto', 'null','LO935', null);

INSERT INTO public.discounts(amount, currency, description, title)
VALUES ( 150.00, 'USD', 'Holiday Discount', 'A discount you should not miss');

INSERT INTO public.vehicles(make, model, year, color, number_of_seats, fuel_type,price, transmission,vehicle_status, plate_number, discount_id)
VALUES ( 'Honda', 'Civic', 2002, 'Red', 5, 'Gasoline', 400.00, 'Manual','null', 'IO521', null);
