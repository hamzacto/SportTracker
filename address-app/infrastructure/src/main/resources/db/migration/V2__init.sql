CREATE TABLE athlete (
     id SERIAL PRIMARY KEY,
     weight FLOAT,
     age INT,
     height FLOAT,
     first_name VARCHAR(255),
     last_name VARCHAR(255),
     sport_level INT,
     heartbeat FLOAT,
     blood_pressure FLOAT
);


CREATE TABLE nutriment (
   id SERIAL PRIMARY KEY,
   name VARCHAR(255),
   calorie FLOAT,
   protein FLOAT,
   fat FLOAT,
   carbohydrate FLOAT
);

CREATE TABLE complement (
    id SERIAL PRIMARY KEY,
    name VARCHAR(255),
    saveur VARCHAR(255)
);

CREATE TABLE gym (
     id SERIAL PRIMARY KEY,
     name VARCHAR(255),
     address VARCHAR(255),
     pricing FLOAT
);

CREATE TABLE athlete_complement (
    athlete_id INTEGER,
    complement_id INTEGER,
    PRIMARY KEY (athlete_id, complement_id),
    FOREIGN KEY (athlete_id) REFERENCES athlete(id),
    FOREIGN KEY (complement_id) REFERENCES complement(id)
);

CREATE TABLE athlete_gym (
     athlete_id INTEGER,
     gym_id INTEGER,
     PRIMARY KEY (athlete_id, gym_id),
     FOREIGN KEY (athlete_id) REFERENCES athlete(id),
     FOREIGN KEY (gym_id) REFERENCES gym(id)
);

CREATE TABLE athlete_nutriment (
   athlete_id INTEGER,
   nutriment_id INTEGER,
   PRIMARY KEY (athlete_id, nutriment_id),
   FOREIGN KEY (athlete_id) REFERENCES athlete(id),
   FOREIGN KEY (nutriment_id) REFERENCES nutriment(id)
);
