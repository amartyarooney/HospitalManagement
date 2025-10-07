INSERT INTO patient (name, gender, birth_date, email, blood_group)
VALUES
    ('Aarav Sharma', 'MALE', '1990-05-10', 'aarav@gmail.com', 'O_POSITIVE'),
    ('Ishita Verma', 'FEMALE', '1992-08-21', 'ishita.verma@example.com', 'A_POSITIVE'),
    ('Rohan Mehta', 'MALE', '1988-12-05', 'rohan.mehta@example.com', 'B_POSITIVE'),
    ('Priya Nair', 'FEMALE', '1995-03-15', 'priya.nair@example.com', 'AB_NEGATIVE'),
    ('Karan Gupta', 'MALE', '1993-07-19', 'karan.gupta@example.com', 'O_NEGATIVE'),
    ('Sneha Iyer', 'FEMALE', '1991-11-09', 'sneha.iyer@example.com', 'A_NEGATIVE');


INSERT INTO doctor (name, specialization, email)
VALUES
    ('Dr. Rakesh Mehta', 'Cardiology', 'rakesh.mehta@example.com'),
    ('Dr. Sneha Kapoor', 'Dermatology', 'sneha.kapoor@example.com'),
    ('Arjun Nair', 'Orthopedics', 'arjun.nair@example.com');

INSERT INTO appointment (appointment_time, reason, doctor_id, patient_id)
VALUES
    ('2025-07-01 10:30:00', 'General Checkup', 1,2),
    ('2025-07-02 11:00:00', 'Skin Rash', 2,2),
    ('2025-07-03 09:45:00', 'Knee Pain', 3,3),
    ('2025-07-04 10:30:00', 'Follow-up', 1,2),
    ('2025-07-05 11:00:00', 'Consultation', 1,4),
     ('2025-07-06 09:45:00', 'Allergy Treatment', 2,5);


