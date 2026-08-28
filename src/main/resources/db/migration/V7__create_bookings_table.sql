
CREATE TABLE bookings (
    id BIGSERIAL PRIMARY KEY,

    space_id BIGINT NOT NULL,
    available_date_id BIGINT NOT NULL,

        CONSTRAINT fk_booking_space
            FOREIGN KEY (space_id)
            REFERENCES spaces(id),

        CONSTRAINT fk_booking_available_date
            FOREIGN KEY (available_date_id)
            REFERENCES available_dates(id),

        UNIQUE (available_date_id)
);