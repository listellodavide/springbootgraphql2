package com.adiwave.projects.query;

import com.adiwave.projects.dao.entity.Post;
import com.adiwave.projects.dao.entity.Vehicle;
import com.adiwave.projects.service.PostService;
import com.adiwave.projects.service.VehicleService;
import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class RootQueries implements GraphQLQueryResolver {

    @Autowired
    private VehicleService vehicleService;

    @Autowired
    private PostService postService;

    public List<Vehicle> getVehicles(final int count) {
        return this.vehicleService.getAllVehicles(count);
    }

    public Optional<Vehicle> getVehicle(final int id) {
        return this.vehicleService.getVehicle(id);
    }

    public List<Post> getRecentPosts(int count, int offset) {
        return postService.getRecentPosts(count, offset);
    }
}
