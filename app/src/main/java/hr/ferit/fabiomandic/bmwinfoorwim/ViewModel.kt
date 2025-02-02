package hr.ferit.fabiomandic.bmwinfoorwim

import androidx.compose.runtime.mutableStateListOf
import androidx.lifecycle.ViewModel

class ViewModel : ViewModel() {

    val carList = mutableStateListOf(*carModels.toTypedArray())


    fun removeCar(car: BMWCarModel) {
        carList.remove(car)
    }


    fun addCar(car: BMWCarModel) {
        val newCar = car.copy(id = carList.size + 1)
        carList.add(newCar)
    }
}
