package com.example.learningjetpackcompose

import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ChainStyle
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.constraintlayout.compose.Dimension


@Preview(showSystemUi = true)
@Composable
fun ConstraintLayoutExamplePreview(){
    ConstraintLayoutExample()
}


@Composable
fun ConstraintLayoutExample(){
    ConstraintLayout {
        val (redButton, greenButton, blueButton, blackButton) = createRefs()

        Button(
            onClick = {},
            colors = ButtonDefaults.buttonColors(Color.Red),
            modifier = Modifier
                .constrainAs(redButton){
                    top.linkTo(parent.top)
                    width = Dimension.matchParent
                    height = Dimension.value(50.dp)
                }
        ) {
            Text(text = "Red")
        }

        Button(
            onClick = {},
            colors = ButtonDefaults.buttonColors(Color.Green),
            modifier = Modifier
                .constrainAs(greenButton){
                    top.linkTo(redButton.bottom)
                }
        ) {
            Text(text = "Green")
        }

        Button(
            onClick = {},
            colors = ButtonDefaults.buttonColors(Color.Blue),
            modifier = Modifier
                .constrainAs(blueButton){
                    top.linkTo(redButton.bottom)
                }
        ) {
            Text(text = "Blue")
        }

        createHorizontalChain(greenButton,blueButton, chainStyle = ChainStyle.Spread)

        val guideLine = createGuidelineFromBottom(0.01f)

        Button(
            onClick = {},
            colors = ButtonDefaults.buttonColors(Color.Black),
            modifier = Modifier
                .constrainAs(blackButton){
                    top.linkTo(blueButton.bottom)
                    //bottom.linkTo(guideLine)
                }
        ) {
            Text(text = "Black")
        }

    }

}