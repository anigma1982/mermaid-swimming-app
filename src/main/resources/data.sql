-- Users
INSERT INTO users (username, password, role) VALUES ('member', '{noop}password','MEMBER');
INSERT INTO users (username, password, role) VALUES ('admin', '{noop}password','ADMIN');

-- Centres
INSERT INTO centres (town, zip, address, phone_number) VALUES ('Aqua Town', '12345','1, Ocean Drive', '555-0101');
INSERT INTO centres (town, zip, address, phone_number) VALUES ('Coral City', '54321','2, Reef Street', '555-0102');
INSERT INTO centres (town, zip, address, phone_number) VALUES ('Splash Ville', '67890','3, Wave Avenue', '555-0103');
INSERT INTO centres (town, zip, address, phone_number) VALUES ('Riverbend', '11223','4, Stream Lane', '555-0105');

-- Courses
INSERT INTO course (name, course_id, description) VALUES ('Beginners Swimming', 101, 'Introductory Swim courses for all ages');
INSERT INTO course (name, course_id, description) VALUES ('Advanced Swimming', 102, 'Advanced Swim courses for all ages');
INSERT INTO course (name, course_id, description) VALUES ('Kids Splash', 103, 'Kids Water fun');
INSERT INTO course (name, course_id, description) VALUES ('Competitive Training', 104, 'For Athletes training');

-- Members
INSERT INTO members (name, email, address, phone, level) VALUES ('David Muller', 'david@swim.com', '123 Main Street', '555-1001', 'Beginner');
INSERT INTO members (name, email, address, phone, level) VALUES ('Rita Calligan', 'rita@swim.com', '456 Oak Avenue', '555-1002', 'Intermediate');
INSERT INTO members (name, email, address, phone, level) VALUES ('Kusumita Ghosh', 'kusumita@swim.com', '123 Main Street', '555-1001', 'Advanced');
INSERT INTO members (name, email, address, phone, level) VALUES ('Anirban Muller', 'anirban@swim.com', '123 Main Street', '555-1001', 'Intermediate');

-- Jobs
INSERT INTO jobs (title, location, description, address) VALUES ('Lifeguard', 'Aqua Town', 'Pool Safety', '1, Ocean Drive');
INSERT INTO jobs (title, location, description, address) VALUES ('Swimming Instructor', 'Coral City', 'Swim Teacher', '2, Reef Street');
INSERT INTO jobs (title, location, description, address) VALUES ('Receptionist', 'Splash Ville', 'Front Office', '3, Wave Avenue');

-- Member-Course Relations
INSERT INTO member_course (member_id, course_id) VALUES (1,1);
INSERT INTO member_course (member_id, course_id) VALUES (1,3);
INSERT INTO member_course (member_id, course_id) VALUES (1,2);
INSERT INTO member_course (member_id, course_id) VALUES (2,4);
INSERT INTO member_course (member_id, course_id) VALUES (2,1);
INSERT INTO member_course (member_id, course_id) VALUES (3,2);
INSERT INTO member_course (member_id, course_id) VALUES (3,3);
INSERT INTO member_course (member_id, course_id) VALUES (3,1);