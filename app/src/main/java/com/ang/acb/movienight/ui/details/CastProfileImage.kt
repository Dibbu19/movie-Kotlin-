package com.ang.acb.movienight.ui.details

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.scale
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import coil.compose.AsyncImage
import coil.request.ImageRequest
import com.ang.acb.movienight.ui.theme.midnight50

@Composable
fun CastProfileImage(
    profileImageUrl: String?,
    modifier: Modifier = Modifier,
) {
    Box(modifier = modifier) {
        // TODO Use placeholder on error
        AsyncImage(
            model = ImageRequest.Builder(LocalContext.current)
                .data(profileImageUrl)
                .crossfade(500)
                .build(),
            contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .matchParentSize()
                .clip(MaterialTheme.shapes.medium),
        )
    }
}

@Composable
private fun PlaceholderProfileImage(
    modifier: Modifier = Modifier,
) {
    Box(
        modifier = modifier.background(
            shape = MaterialTheme.shapes.medium,
            color = midnight50,
        ),
        contentAlignment = Alignment.Center,
    ) {
        Icon(
            imageVector = Icons.Default.AccountCircle,
            contentDescription = null,
            tint = MaterialTheme.colors.primary,
            modifier = Modifier.scale(2f)
        )
    }
}