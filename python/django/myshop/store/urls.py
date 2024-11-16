from django.urls import path, include
from rest_framework_simplejwt.views import TokenObtainPairView, TokenRefreshView

urlpatterns = [
    path('api/token/', TokenObtainPairView.as_view(), name='token_obtain_pair'),
    path('api/token/refresh/', TokenRefreshView.as_view(), name='token_refresh'),
    path('api/products/', ProductViewSet.as_view({'get': 'list'}), name='product-list'),
    path('api/orders/', OrderViewSet.as_view({'get': 'list'}), name='order-list'),
    path('api/reviews/', ReviewViewSet.as_view({'get': 'list'}), name='review-list'),
]
