# CampusConnect portal architecture

CampusConnect favors explicit web boundaries over a large client-side state machine. Servlets translate requests into small application actions; repositories own JDBC access; domain records express the data and validation needed by the portal.

The first slice provides a student value object, a health servlet, a schema, and an accessible landing page. Future slices should keep administrative permissions visible at page and service boundaries.
