package com.kichou.imad.meditationui.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.kichou.imad.meditationui.R
import com.kichou.imad.meditationui.ui.theme.ButtonBlue
import com.kichou.imad.meditationui.ui.theme.DarkerButtonBlue
import com.kichou.imad.meditationui.ui.theme.DeepBlue
import com.kichou.imad.meditationui.ui.theme.LightRed
import com.kichou.imad.meditationui.ui.theme.TextWhite


@Composable
fun HomeSceen(){
    
    Box(modifier = Modifier
        .fillMaxSize()
        .background(DeepBlue)){

        Column {
            GreetingSection()
            ChipSection(chips = listOf("Sweet Sleep","Insomnia","Depression","Anxiety"))
            DailyThoughtsSection()
        }



    }
    
    
    
}

@Composable
fun GreetingSection(
    name : String = "Imad"){

    Row (modifier = Modifier
        .fillMaxWidth()
        .padding(20.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween){

        Column(
            verticalArrangement = Arrangement.Center) {
            Text(text = "Good Morning, $name",
                style = MaterialTheme.typography.displayLarge)

            Text(text = "We wish you are having a good day!",
                style = MaterialTheme.typography.bodyLarge,
                color = Color.Gray)

        }

        Icon(painter = painterResource(id = R.drawable.ic_search),
            contentDescription = "Content search",
            tint = Color.White,
            modifier = Modifier.size(24.dp))


    }


}


@Composable
fun ChipSection(
    chips : List<String>){

    var selectedChipIndex by remember{
        mutableStateOf(0)
    }

    LazyRow{

        items(chips.size){
            Box(modifier = Modifier
                .padding(start = 15.dp, top = 15.dp, bottom = 15.dp)
                .clickable { selectedChipIndex = it }
                .clip(shape = RoundedCornerShape(10.dp))
                .background(
                    if (selectedChipIndex == it) ButtonBlue
                    else DarkerButtonBlue
                )
                .padding(15.dp)){

                Text(text = chips[it],
                    color = TextWhite)

            }
        }


    }




}


@Composable
fun DailyThoughtsSection(){

        Surface(modifier = Modifier
            .fillMaxWidth()
            .padding(15.dp),
            color = LightRed,
            shape = RoundedCornerShape(10.dp),
            tonalElevation = 6.dp,
            shadowElevation = 6.dp) {
            
            Row (modifier = Modifier
                .fillMaxWidth()
                .padding(20.dp),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween) {
                
                Column {
                    Text(text = "Daily Thoughts",
                        style = MaterialTheme.typography.displayLarge,
                        color = TextWhite)

                    Text(text = "Meditation * 3-10 min",
                        style = MaterialTheme.typography.bodyLarge)

                }


                Box(modifier = Modifier
                    .background(color = ButtonBlue, shape = CircleShape)) {

                    Icon(painter = painterResource(id = R.drawable.ic_play),
                        contentDescription = "play",
                        tint = Color.White,
                        modifier = Modifier
                            .size(30.dp)
                            .padding(10.dp))

                }
                
                
                
                
            }
            

        }

}