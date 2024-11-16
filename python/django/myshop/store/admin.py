from django.contrib import admin
from .models import Product, Order, OrderItem, Review

class OrderItemInline(admin.TabularInline):
    model = OrderItem
    extra = 1

class OrderAdmin(admin.ModelAdmin):
    inlines = [OrderItemInline]
    list_display = ('user', 'created_at', 'status')
    actions = ['mark_as_shipped']

    @admin.action(description="Mark selected orders as shipped")
    def mark_as_shipped(self, request, queryset):
        queryset.update(status='SHIPPED')

admin.site.register(Product)
admin.site.register(Order, OrderAdmin)
admin.site.register(Review)
