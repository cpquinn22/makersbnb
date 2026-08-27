

CREATE TABLE available_dates (
    id BIGSERIAL PRIMARY KEY,
    date DATE,
    space_id BIGINT,
    CONSTRAINT fk_space
        FOREIGN KEY (space_id)
        REFERENCES spaces(id)
        ON DELETE CASCADE
);