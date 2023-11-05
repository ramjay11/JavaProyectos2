CREATE TABLE course (
   -- course_id integer identity NOT NULL,
    course_id integer GENERATED BY DEFAULT AS IDENTITY PRIMARY KEY,
    title varchar(80) NOT NULL, -- Course name
    description varchar(500) NOT NULL, -- Course description
    link varchar(255) NOT NULL, -- Course landing page link
    CONSTRAINT pk_course_course_id PRIMARY KEY(course_id)
);