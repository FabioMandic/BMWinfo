package hr.ferit.fabiomandic.bmwinfoorwim

data class BMWCarModel(
    val id: Int,
    val name: String,
    val type: String,
    val description: String,
    val imageRes: Int
)

val carModels = listOf(
    BMWCarModel(
        1,
        "BMW X1",
        "SUV",
        """
        Compact and efficient SUV with sporty handling. The BMW X1 is perfect for both city streets and weekend adventures, 
        offering a spacious interior and advanced technology. With a sleek exterior and responsive engine, the X1 guarantees a 
        dynamic and enjoyable ride for every driver.
        """.trimIndent(),
        R.drawable.bmwx1
    ),
    BMWCarModel(
        2,
        "BMW X2",
        "SUV",
        """
        Stylish and sporty SUV for urban adventures. The BMW X2 combines bold design with dynamic performance, 
        making it a standout choice for modern explorers. Its sporty silhouette and agile handling create a 
        driving experience that's both thrilling and refined.
        """.trimIndent(),
        R.drawable.bmwx2
    ),
    BMWCarModel(
        3,
        "BMW X3",
        "SUV",
        """
        The perfect balance of comfort and performance. The BMW X3 offers luxurious comfort, cutting-edge technology, 
        and exceptional driving dynamics. Whether you're navigating through city streets or exploring off-road paths, 
        the X3 provides unmatched versatility and style.
        """.trimIndent(),
        R.drawable.bmwx3
    ),
    BMWCarModel(
        4,
        "BMW X4",
        "SUV",
        """
        Sleek coupe-style SUV for dynamic driving. The BMW X4's distinctive design and powerful engine deliver an unforgettable 
        driving experience. It boasts an advanced infotainment system and a high-quality interior that exudes luxury.
        """.trimIndent(),
        R.drawable.bmwx4
    ),
    BMWCarModel(
        5,
        "BMW Series 2 Coupe",
        "Coupe",
        """
        Elegant two-door coupe with a powerful engine. The BMW Series 2 Coupe combines athletic performance with a stylish design, 
        perfect for driving enthusiasts. It offers nimble handling and state-of-the-art connectivity, making every drive exhilarating.
        """.trimIndent(),
        R.drawable.bmwserija2coupe
    ),
    BMWCarModel(
        6,
        "BMW Series 4 Coupe",
        "Coupe",
        """
        Sporty coupe with luxury features. The BMW Series 4 Coupe blends sleek aesthetics with cutting-edge technology, offering a 
        premium driving experience. With advanced driver-assistance systems, it ensures safety and convenience on the road.
        """.trimIndent(),
        R.drawable.bmwserija4coupe
    ),
    BMWCarModel(
        7,
        "BMW Series 8 Coupe",
        "Coupe",
        """
        Ultimate luxury coupe with advanced technology. The BMW Series 8 Coupe is the epitome of elegance and innovation, delivering 
        unparalleled comfort and power. Its refined craftsmanship and high-performance engine set a new standard in luxury coupes.
        """.trimIndent(),
        R.drawable.bmwserija8coupe
    ),
    BMWCarModel(
        8,
        "BMW Series 2 Gran Coupe",
        "Sedan",
        """
        Compact sedan with stylish design. The BMW Series 2 Gran Coupe features bold lines and a sophisticated interior, 
        making it a standout in its class. It offers an excellent balance of agility, comfort, and state-of-the-art features.
        """.trimIndent(),
        R.drawable.bmwserija2grancoupe
    ),
    BMWCarModel(
        9,
        "BMW Series 4 Gran Coupe",
        "Sedan",
        """
        Spacious sedan with elegant aesthetics. The BMW Series 4 Gran Coupe offers premium comfort and dynamic performance 
        in a sleek package. Its versatile design combines the practicality of a sedan with the stylish appeal of a coupe.
        """.trimIndent(),
        R.drawable.bmwserija4grancoupe
    ),
    BMWCarModel(
        10,
        "BMW Series 8 Gran Coupe",
        "Sedan",
        """
        Top-class luxury sedan with superior comfort. The BMW Series 8 Gran Coupe combines exceptional craftsmanship with 
        state-of-the-art technology. It offers a spacious interior and innovative features, perfect for long journeys or city commutes.
        """.trimIndent(),
        R.drawable.bmwserija8grancoupe
    ),
    BMWCarModel(
        11,
        "BMW Series 1",
        "Luxury",
        """
        Versatile hatchback with premium features. The BMW Series 1 offers compact dimensions and a luxurious interior, 
        perfect for urban driving. Its agile handling and advanced technology make it an ideal choice for modern drivers.
        """.trimIndent(),
        R.drawable.bmwserija1
    ),
    BMWCarModel(
        12,
        "BMW Series 3",
        "Luxury",
        """
        Classic sedan with a blend of performance and luxury. The BMW Series 3 is a timeless icon, delivering an exhilarating 
        driving experience. It features top-notch build quality and cutting-edge connectivity options for the modern world.
        """.trimIndent(),
        R.drawable.bmwserija3
    ),
    BMWCarModel(
        13,
        "BMW Series 5",
        "Luxury",
        """
        Premium executive sedan with advanced features. The BMW Series 5 is designed for business and leisure, combining 
        comfort and cutting-edge innovation. Its spacious interior and smooth ride make it perfect for every occasion.
        """.trimIndent(),
        R.drawable.bmwserija5
    ),
    BMWCarModel(
        14,
        "BMW Series 6",
        "Luxury",
        """
        High-performance sedan with cutting-edge technology. The BMW Series 6 offers remarkable power, precise handling, 
        and a luxurious cabin. It is the ultimate choice for drivers who value both speed and sophistication.
        """.trimIndent(),
        R.drawable.bmwserija6
    )
)
