import SimpleImageSlider from "react-simple-image-slider";
import "../Styles/Sliders.css";

const images = [
  { url: "../assets/1.png" },
  { url: "../assets/2.png" },
  { url: "../assets/3.png" },
  //  { url: "../assets/header4_1.jpg" },
  //  { url: "../assets/header3.jpg" },
  //  { url: "../assets/header4.jpg" },
  //  { url: "../assets/header5.jpg" },
];

const Sliders = () => {
  return (
    <div className="slider-container">
      <SimpleImageSlider
        width={1200}
        height={500}
        images={images}
        showBullets={true}
        showNavs={true}
        autoPlay={true}
        navStyle={2}
        style={{borderRadius: "10px"}}
      />
    </div>
  );
}

export default Sliders;
