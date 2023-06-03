package app.lawnchair.lawnicons.ui.components.home

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import app.lawnchair.lawnicons.ui.util.Elevation
import app.lawnchair.lawnicons.ui.util.surfaceColorAtElevation

@Composable
fun SearchBarBase(content: (@Composable RowScope.() -> Unit)? = null) {
    Row(
        content = content ?: {},
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier
            .padding(top = 8.dp)
            .padding(horizontal = 16.dp)
            .fillMaxWidth()
            .height(52.dp)
            .background(
                color = MaterialTheme.colorScheme.surfaceColorAtElevation(Elevation.Level2),
                shape = CircleShape,
            ),
    )
}
