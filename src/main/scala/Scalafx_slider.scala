import scalafx.application.JFXApp
import scalafx.application.JFXApp.PrimaryStage
import scalafx.geometry.Insets
import scalafx.scene.Scene
import scalafx.scene.control.{Slider, TextField}
import scalafx.scene.layout.{Region, VBox}
 
object SliderDemo extends JFXApp {
  stage = new PrimaryStage {
  	title.value = "Slider Demo"
    scene = new Scene(300, 200) {
      content = new Slider(0, 10000, 1000)
    }
  }
}
