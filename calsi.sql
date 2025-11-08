
USE careerdb;

CREATE TABLE careers (
    id INT PRIMARY KEY AUTO_INCREMENT,
    skill VARCHAR(50),
    interest VARCHAR(50),
    career VARCHAR(100)
);

-- Insert 25 sample combinations
INSERT INTO careers (skill, interest, career) VALUES
('Programming', 'Problem Solving', 'Software Developer'),
('Programming', 'AI', 'Machine Learning Engineer'),
('Design', 'Creativity', 'Graphic Designer'),
('Writing', 'Communication', 'Content Writer'),
('Management', 'Leadership', 'Project Manager'),
('Networking', 'Hardware', 'Network Administrator'),
('Data Analysis', 'Statistics', 'Data Analyst'),
('Programming', 'Web', 'Web Developer'),
('Programming', 'Mobile', 'Android Developer'),
('Programming', 'Game Design', 'Game Developer'),
('Finance', 'Mathematics', 'Financial Analyst'),
('Biology', 'Research', 'Biotechnologist'),
('Chemistry', 'Research', 'Chemical Engineer'),
('Physics', 'Innovation', 'Research Scientist'),
('Teaching', 'Communication', 'Teacher'),
('Marketing', 'Creativity', 'Digital Marketer'),
('Art', 'Design', 'Animator'),
('Psychology', 'Human Behavior', 'Counselor'),
('Law', 'Debating', 'Lawyer'),
('Medicine', 'Helping Others', 'Doctor'),
('Accounting', 'Numbers', 'Chartered Accountant'),
('Programming', 'Security', 'Cybersecurity Analyst'),
('Sales', 'Persuasion', 'Sales Executive'),
('Music', 'Creativity', 'Music Producer'),
('Writing', 'Storytelling', 'Author'),
('No','No','Be jobless or you need to study');
Select * from careers;




