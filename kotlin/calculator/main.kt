class MainActivity : AppCompatActivity() {
    private lateinit var display: TextView
    private var input: String = ""
    private var operator: Char? = null
    private var operand1: Double = 0.0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        display = findViewById(R.id.display)
        setupButtons()
    }

    private fun setupButtons() {
        val buttons = listOf<Button>(
            findViewById(R.id.btn0), findViewById(R.id.btn1), /*...*/ findViewById(R.id.btnEquals)
        )
        
        buttons.forEach { button ->
            button.setOnClickListener { onButtonClick(button.text.toString()) }
        }
    }

    private fun onButtonClick(value: String) {
        when (value) {
            in "0".."9" -> input += value
            "+" -> handleOperator('+')
            "-" -> handleOperator('-')
            "*" -> handleOperator('*')
            "/" -> handleOperator('/')
            "=" -> calculate()
            "C" -> clear()
        }
        display.text = input
    }

    private fun handleOperator(op: Char) {
        if (input.isNotEmpty()) {
            operand1 = input.toDouble()
            operator = op
            input = ""
        }
    }

    private fun calculate() {
        val operand2 = input.toDoubleOrNull() ?: return
        input = when (operator) {
            '+' -> (operand1 + operand2).toString()
            '-' -> (operand1 - operand2).toString()
            '*' -> (operand1 * operand2).toString()
            '/' -> if (operand2 != 0.0) (operand1 / operand2).toString() else "Error"
            else -> input
        }
        operator = null
    }

    private fun clear() {
        input = ""
        operator = null
        operand1 = 0.0
    }
}
