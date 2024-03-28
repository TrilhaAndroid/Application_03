package br.com.leonardobarral.application_03

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.MailOutline
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Checkbox
import androidx.compose.material3.CheckboxDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.RadioButton
import androidx.compose.material3.RadioButtonDefaults
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardCapitalization
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.com.leonardobarral.application_03.ui.theme.Application_03Theme
import br.com.leonardobarral.application_03.ui.theme.GeneralBol

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Application_03Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    BasicComponentsScrenn()
                }
            }
        }
    }

}

@Composable
fun BasicComponentsScrenn() {

    val textFieldNomeValue = remember{
        mutableStateOf("")
    }
    val textFieldIdadeValue = remember{
        mutableStateOf("")
    }
    val textFieldAlturaValue = remember {
        mutableStateOf("")
    }
    val textFieldPesoValue = remember{
        mutableStateOf("")
    }
    val textFieldEmailValue = remember{
        mutableStateOf("")
    }
    val textFieldPasswordValue = remember{
        mutableStateOf("")
    }
    val textFieldPhoneValue = remember{
        mutableStateOf("")
    }
    val textFieldDidadeValue = remember{
        mutableStateOf("")
    }
    val textFieldLinkedinValue = remember{
        mutableStateOf("")
    }

    val checkBoxJavaValue = remember{
        mutableStateOf(false)
    }
    val checkBoxKotlinValue = remember{
        mutableStateOf(false)
    }
    val checkBoxReactNativeValue = remember{
        mutableStateOf(false)
    }

    val radioButtonSoValue = remember{
        mutableIntStateOf(0)
    }

    Column (
        modifier = Modifier
            .background(Color.Black)
    ){
        Text(
            text = "FIAP",
            fontSize = 32.sp,
            fontWeight = FontWeight.Bold,
            color = Color(0xFFED145B),
            fontFamily = FontFamily.Serif,
            modifier = Modifier
                .background(Color.Yellow)
                .fillMaxWidth(),
            textAlign = TextAlign.End
        )
        Text(
            text = "Desenvolvendo aplicalções Android",
            fontSize = 16.sp,
            fontWeight = FontWeight.SemiBold,
            color = Color.White,
            fontFamily = GeneralBol,
            modifier = Modifier
                .align(Alignment.CenterHorizontally)
        )


        TextField(
            value = textFieldNomeValue.value,
            onValueChange = {valor ->
                textFieldNomeValue.value = valor
            },
            keyboardOptions = KeyboardOptions(
                capitalization = KeyboardCapitalization.Words
            ),
            placeholder = {
                Text(
                    text = "João Carlos",
                    color = Color(0xB0686667)
                    )
            },
            label = {
                    Text(text = "Nome completo")
            },
            leadingIcon = {
                          Icon(
                              imageVector = Icons.Default.Person,
                              contentDescription = "",
                              tint = Color(237, 20, 91)
                          )
            },
            colors = TextFieldDefaults.colors(
                focusedTextColor = Color.White,
                unfocusedTextColor = Color.Green,
                unfocusedPlaceholderColor = Color.Magenta
            ),
            modifier = Modifier
                .fillMaxWidth()

        )

        TextField(
            value = textFieldEmailValue.value,
            onValueChange = {valor ->
                textFieldEmailValue.value = valor
            },
            keyboardOptions = KeyboardOptions(
                keyboardType = KeyboardType.Email
            ),
            placeholder = {
                Text(
                    text = "joaoarlos@exemplo.com",
                    color = Color(0xB0686667)
                )
            },
            label = {
                Text(text = "E-mail")
            },
            leadingIcon = {
                Icon(
                    imageVector = Icons.Default.MailOutline,
                    contentDescription = "",
                    tint = Color(237, 20, 91)
                )
            },
            modifier = Modifier
                .fillMaxWidth()
        )

        TextField(
            value = textFieldPhoneValue.value,
            onValueChange = {valor ->
                textFieldPhoneValue.value = valor
            },
            keyboardOptions = KeyboardOptions(
                keyboardType = KeyboardType.Phone
            ),
            placeholder = {
                Text(text = "(00) 91234-5678",
                    color = Color(0xB0686667)
                )
            },
            label = {
                Text(text = "Telefone")
            },
            leadingIcon = {
                Icon(
                    imageVector = Icons.Default.Phone,
                    contentDescription = "",
                    tint = Color(237, 20, 91)
                )
            },
            modifier = Modifier
                .fillMaxWidth()
        )

        TextField(
            value = textFieldIdadeValue.value,
            onValueChange = {valor ->
                textFieldIdadeValue.value = valor
            },
            keyboardOptions = KeyboardOptions(
                keyboardType = KeyboardType.Number
            ),
            placeholder = {
                Text(text = "29",
                    color = Color(0xB0686667)
                )
            },
            label = {
                Text(text = "Idade")
            },
            modifier = Modifier
                .fillMaxWidth()
        )

        TextField(
            value = textFieldPesoValue.value,
            onValueChange = {valor ->
                textFieldPesoValue.value = valor
            },
            keyboardOptions = KeyboardOptions(
                keyboardType = KeyboardType.Decimal
            ),
            placeholder = {
                Text(text = "95",
                    color = Color(0xB0686667)
                )
            },
            label = {
                Text(text = "Peso kg")
            },
            modifier = Modifier
                .fillMaxWidth()
        )

        TextField(
            value = textFieldAlturaValue.value,
            onValueChange = {valor ->
                textFieldAlturaValue.value = valor
            },
            keyboardOptions = KeyboardOptions(
                keyboardType = KeyboardType.Decimal
            ),
            placeholder = {
                Text(text = "1.98",
                    color = Color(0xB0686667)
                )
            },
            label = {
                Text(text = "Altura m")
            },
            modifier = Modifier
                .fillMaxWidth()
        )


        TextField(
            value = textFieldLinkedinValue.value,
            onValueChange = {valor ->
                textFieldLinkedinValue.value = valor
            },
            keyboardOptions = KeyboardOptions(
                keyboardType = KeyboardType.Uri
            ),
            placeholder = {
                Text(text = "http://www.linkedin.com/in/joaocarlos",
                    color = Color(0xB0686667)
                )
            },
            label = {
                Text(text = "Linkedin")
            },
            modifier = Modifier
                .fillMaxWidth()
        )
        
        TextField(
            value = textFieldPasswordValue.value,
            onValueChange = {valor ->
                textFieldPasswordValue.value = valor
            },
            keyboardOptions = KeyboardOptions(
                keyboardType = KeyboardType.Password
            ),
            placeholder = {
                Text(text = "********",
                    color = Color(0xB0686667)
                )
            },
            label = {
                Text(text = "Senha")
            },
            leadingIcon = {
                Icon(
                    imageVector = Icons.Default.Lock,
                    contentDescription = "",
                    tint = Color(237, 20, 91)
                )
            },
            modifier = Modifier
                .fillMaxWidth()
        )
        Spacer(modifier = Modifier.height(10.dp))
        Row (
            modifier = Modifier
                .fillMaxWidth()
                .height(20.dp),
            verticalAlignment = Alignment.CenterVertically
        ){
            Checkbox(
                checked = checkBoxJavaValue.value,
                onCheckedChange = {
                    checkBoxJavaValue.value = it
                },
                colors = CheckboxDefaults.colors(
                    checkedColor = Color.White,
                    uncheckedColor = Color(0xFFed145b)
                ),
            )
            Text(
                text = "Java",
                color = Color.White
            )

        }
        Row (
            modifier = Modifier
                .fillMaxWidth()
                .height(30.dp),
            verticalAlignment = Alignment.CenterVertically
        ){
            Checkbox(
                checked = checkBoxKotlinValue.value,
                onCheckedChange = {
                    checkBoxKotlinValue.value = it
                },
                colors = CheckboxDefaults.colors(
                    checkedColor = Color.White,
                    uncheckedColor = Color(0xFFed145b)
                ),
            )
            Text(
                text = "Kotlin",
                color = Color.White
            )

        }
        Row (
            modifier = Modifier
                .fillMaxWidth()
                .height(30.dp),
            verticalAlignment = Alignment.CenterVertically
        ){
            Checkbox(
                checked = checkBoxReactNativeValue.value,
                onCheckedChange = {
                    checkBoxReactNativeValue.value = it
                },
                colors = CheckboxDefaults.colors(
                    checkedColor = Color.White,
                    uncheckedColor = Color(0xFFed145b)
                ),
            )
            Text(
                text = "React Native",
                color = Color.White
            )

        }

        Row (
            modifier = Modifier
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {

            Row(
                modifier = Modifier.weight(0.3f),
                horizontalArrangement = Arrangement.Start,
                verticalAlignment = Alignment.CenterVertically
            ) {

                RadioButton(
                    selected = radioButtonSoValue.intValue == 0,
                    onClick = {
                        radioButtonSoValue.intValue = 0
                    },
                    colors = RadioButtonDefaults.colors(
                        selectedColor = Color.White,
                        unselectedColor = Color(0xFFed145b)
                    )
                )

                Text(
                    text = "macOS",
                    color = Color.White
                )
            }

            Row(
                modifier = Modifier.weight(0.3f),
                horizontalArrangement = Arrangement.Start,
                verticalAlignment = Alignment.CenterVertically
            ) {

                RadioButton(
                    selected = radioButtonSoValue.intValue == 1,
                    onClick = {
                        radioButtonSoValue.intValue = 1
                    },
                    colors = RadioButtonDefaults.colors(
                        selectedColor = Color.White,
                        unselectedColor = Color(0xFFed145b)
                    )
                )
                Text(
                    text = "GNULinux",
                    color = Color.White
                )
            }

            Row(
                modifier = Modifier.weight(0.3f),
                horizontalArrangement = Arrangement.Start,
                verticalAlignment = Alignment.CenterVertically
            ) {

                RadioButton(
                    selected = radioButtonSoValue.intValue == 2,
                    onClick = {
                        radioButtonSoValue.intValue = 2
                    },
                    colors = RadioButtonDefaults.colors(
                        selectedColor = Color.White,
                        unselectedColor = Color(0xFFed145b)
                    )
                )
                Text(
                    text = "Windows",
                    color = Color.White
                )
            }
        }

        Row (
            modifier = Modifier
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.Center
        ){
            Button(
                onClick = {
                    textFieldNomeValue.value = ""
                    textFieldEmailValue.value = ""
                    textFieldPhoneValue.value = ""
                    textFieldDidadeValue.value = ""
                    textFieldPesoValue.value = ""
                    textFieldAlturaValue.value = ""
                    textFieldLinkedinValue.value = ""
                    textFieldPasswordValue.value = ""
                    checkBoxJavaValue.value = false
                    checkBoxKotlinValue.value = false
                    checkBoxReactNativeValue.value = false
                    radioButtonSoValue.value = 0

                },
                modifier = Modifier.size(
                    200.dp,
                    60.dp
                ),
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color.Magenta
                ),
                border = BorderStroke(
                    width = 3.dp,
                    color = Color.White
                )
            ) {
                Text(text = "Clear")
            }

        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun Application_03ThemePreview() {
    Application_03Theme{
        BasicComponentsScrenn()
    }
}

