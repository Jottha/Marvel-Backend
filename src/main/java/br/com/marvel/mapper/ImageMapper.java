package br.com.marvel.mapper;

import java.util.ArrayList;
import java.util.List;

import br.com.marvel.domain.dto.ImageResponse;
import br.com.marvel.domain.model.Image;

public class ImageMapper {

	public static List<ImageResponse> createImageResponseList(List<Image> listImage) {
		List<ImageResponse> imageResponseList = new ArrayList<ImageResponse>();

		listImage.forEach(image -> {
			imageResponseList.add(createImageResponse(image));
		});

		return imageResponseList;
	}

	public static ImageResponse createImageResponse(Image image) {
		ImageResponse ImageResponse = new ImageResponse ();

		ImageResponse.setExtension(image.getExtension());
		ImageResponse.setPath(image.getPath());

		return ImageResponse;
	}
}
