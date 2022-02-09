// Navigation Bar SECTION
const navBar = {
  show: true,
};

// Main Body SECTION
const mainBody = {
  gradientColors: "#4484ce, #1ad7c0, #ff9b11, #9b59b6, #ff7f7f, #ecf0f1",
  firstName: "Hang",
  middleName: "",
  lastName: "Xia",
  message: "| Master Student | Computer Software engineering | Full Stack Developer ",
  icons: [
    {
      image: "fa-github",
      url: "https://github.com/summersummerhan/project/tree/main/project",
    },
    {
      image: "fa-instagram",
      url: "https://www.instagram.com/summeriins/",
    },
    {
      image: "fa-linkedin",
      url: "https://www.linkedin.com/in/hang-xia-59379716b/",
    },
  ],
};

// ABOUT SECTION
// If you want the About Section to show a profile picture you can fill the profilePictureLink either with:
//a) your Instagram username
//      i.e:profilePictureLink:"johnDoe123",
//b) a link to an hosted image
//      i.e:profilePictureLink:"www.picturesonline.com/johnDoeFancyAvatar.jpg",
//c) image in "editable-stuff" directory and use require("") to import here,
//      i.e: profilePictureLink: require("../editable-stuff/hashirshoaeb.png"),
//d) If you do not want any picture to be displayed, just leave it empty :)
//      i.e: profilePictureLink: "",
// For Resume either provide link to your resume or import from "editable-stuff" directory
//     i.e resume: require("../editable-stuff/resume.pdf"),
//         resume: "https://docs.google.com/document/d/13_PWdhThMr6roxb-UFiJj4YAFOj8e_bv3Vx9UHQdyBQ/edit?usp=sharing",

const about = {
  show: true,
  heading: "About Me",
  imageLink: require("../editable-stuff/hangxia.png"),
  imageSize: 375,
  message:
  "Hello. My name is HangXia. I am completing my master's program at Northeastern University, and I have a great passion for learning new knowledge and am willing to communicate with people",
  resume: "https://docs.google.com/document/d/13_PWdhThMr6roxb-UFiJj4YAFOj8e_bv3Vx9UHQdyBQ/edit?usp=sharing",
};

// PROJECTS SECTION
// Setting up project lenght will automatically fetch your that number of recently updated projects, or you can set this field 0 to show none.
//      i.e: reposLength: 0,
// If you want to display specfic projects, add the repository names,
//      i.e ["repository-1", "repo-2"]
const repos = {
  show: true,
  heading: "My Github",
  gitHubUsername: "summersummerhan", //i.e."johnDoe12Gh"
  reposLength: 2,
  specificRepos: [""],
};

// Leadership SECTION
const leadership = {
  show: true,
  heading: "Leadership",
  message:
    "During my undergraduate period, I have been working in my college's student union, managing the day-to-day affairs of college students and liaising with outside businesses to fund student activities.",
  images: [
    { 
      img: require("../editable-stuff/Student.png"),   
    },
    { 
      img: require("../editable-stuff/CHA.png"), 
    },
  ],
  imageSize: {
    width:"615",
    height:"450"
  }
};

// SKILLS SECTION
const skills = {
  show: true,
  heading: "Skills",
  hardSkills: [
    { name: "JAVA", value: 90 },
    { name: "SQL", value: 70 },
    { name: "Data Structures", value: 85 },
    { name: "JavaScript", value: 70 },
    { name: "React", value: 70 },
    { name: "HTML/CSS", value: 75 },

  ],
  softSkills: [

    { name: "Collaboration", value: 90 },
    { name: "Adaptability", value: 90 },
    { name: "Problem Solving", value: 70 },
    { name: "Empathy", value: 100 },
    { name: "Organization", value: 80 },
    { name: "Creativity", value: 70 },
  ],
};

// GET IN TOUCH SECTION
const getInTouch = {
  show: true,
  heading: "Get In Touch",
  message:
    "I'm currently looking for intern Software Engineering opportunities! If you know of any positions available,  or if you just want to say hi, please feel free to email me at",
  email: "xia.han@northeastern.edu",
};




export { navBar, mainBody, about, repos, skills, leadership,getInTouch };
