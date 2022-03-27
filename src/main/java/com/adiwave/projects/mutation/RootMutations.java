package com.adiwave.projects.mutation;

import com.adiwave.projects.dao.entity.Post;
import com.adiwave.projects.service.PostService;
import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.adiwave.projects.dao.entity.Vehicle;
import com.adiwave.projects.service.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class RootMutations implements GraphQLMutationResolver {

    @Autowired
    private VehicleService vehicleService;

    @Autowired
    private PostService postService;

    public Vehicle createVehicle(final String type, final String modelCode, final String brandName, final String launchDate) {
        return this.vehicleService.createVehicle(type, modelCode, brandName, launchDate);
    }

    public Post writePost(String title, String text, String category, int authorId) {
        return this.postService.savePost(title, text, category, authorId);
    }
}
