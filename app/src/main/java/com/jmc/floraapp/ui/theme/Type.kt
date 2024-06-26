package com.jmc.floraapp.ui.theme

import androidx.compose.material.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.jmc.floraapp.R

val firaSansFamily = FontFamily(
    Font(R.font.dmsansregular, FontWeight.Normal),
    Font(R.font.dmsansmedium, FontWeight.Medium),
    Font(R.font.dmsansbold, FontWeight.Bold),
)
// Set of Material typography styles to start with
val Typography = Typography(
    body1 = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp
    )
)