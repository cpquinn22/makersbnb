ALTER TABLE bookings
DROP CONSTRAINT fk_booking_available_date;

ALTER TABLE bookings
DROP CONSTRAINT bookings_available_date_id_key;

ALTER TABLE bookings
DROP COLUMN available_date_id;

ALTER TABLE bookings
    ADD COLUMN start_date DATE NOT NULL;

ALTER TABLE bookings
    ADD COLUMN end_date DATE NOT NULL;